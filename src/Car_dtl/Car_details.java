package Car_dtl;

	public class Car_details {
		int reg_no;
		int speed=0;
		int gear =1;
		public void start()
		{
			System.out.println("Car starts");
		}
		public void Accelerate()
		{
			System.out.println("Car Accelerate");
		}
		public void speed()
		{
			System.out.println("Car is in speed ");
		}
		public static void main(String args[])
		{
			Car_details sc=new Car_details ();
			sc.start();
			sc.Accelerate();
			sc.speed();
			
		}
	}
