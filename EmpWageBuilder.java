	class EmpWageBuilder{


	public static final int IS_FULL_TIME=1;
   public static final int IS_PART_TIME=2;
   public static final int EMP_RATE_PER_HR=20;

   public static final int MAX_WORKING_DAYS=20;
   public static final int  MAX_HRS_IN_MONTH=100;


	public static int computeWage(){

	int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
	int totalWorkingHrs=0;

	 while(totalEmpHrs<=MAX_HRS_IN_MONTH &&
                totalWorkingHrs<MAX_WORKING_DAYS)
	{


        totalWorkingDays++;
        int empCheck= (int) (Math.floor(Math.random()*10)%2+1);

                switch (empCheck)
                {
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                case IS_PART_TIME:
                        empHrs=4;
                        break;
                default:
                        empHrs=0;
                                break;
                }

        totalEmpHrs+=empHrs;
			System.out.println("Day: "+totalWorkingDays+" Emp hrs: "+empHrs);
        }
		int totalEmpWage = totalEmpHrs*EMP_RATE_PER_HR;
      System.out.println("Total Wage till 100 hrs and 20 Working days = "+ totalEmpWage);
		return totalEmpWage;
		}


		public static void main( String args[])
	{
		computeWage();





		}


	}
