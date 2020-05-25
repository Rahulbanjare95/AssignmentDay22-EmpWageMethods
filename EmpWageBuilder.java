	class EmpWageBuilder{


	public static final int IS_FULL_TIME=1;
   public static final int IS_PART_TIME=2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmpWageBuilder(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
		this.company =company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;

		}

	public  int computeWage()
	{


	int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
	int totalWorkingHrs=0;

	 while(totalEmpHrs<=maxHoursPerMonth &&
                totalWorkingHrs<numOfWorkingDays)
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
		int totalEmpWage = totalEmpHrs*empRatePerHour;
      System.out.println("Total Wage till 100 hrs and 20 Working days = "+ totalEmpWage);
		return totalEmpWage;
		}



		public static void main( String args[])

		{

		EmpWageBuilder spar = new EmpWageBuilder("Spar",20,2,10);
		EmpWageBuilder bigbasket= new EmpWageBuilder("bigbasket",25,4,20);
		
		System.out.println("Total Emp Wage for Company " + spar.company + " = "+spar.computeWage());

		System.out.println("Total Emp Wage for Company " + bigbasket.company + " = "+bigbasket.computeWage());



		}


	}
