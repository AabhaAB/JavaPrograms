package Imp;

public class Multi_D_Array {

	public static void main(String[] args) {
		String[] department= { "CS", "IT", "Commerce"};
		int dept, st, sc, total=0;
		double perc=0;
		int [] [] [] scores= {{{30,40,50},{80,85,90},{50, 63, 71}},
		{{70,80,90},{20,55,80},{20, 43, 41}},
		{{50,70,30},{60,35,40},{90, 93, 81}}};
		for(dept=0; dept<3; dept++)
		{
			for(int i=0; i<3;i++)
			{
				System.out.println("Department"+department[i]+":");
				for(st=0; st<3; st++)
				{
					System.out.println("Student"+(st+1)+"scores:");
					for(sc=0; sc<3; sc++)
					{
						System.out.println(scores[dept][st][sc]+"");
						total= scores[dept][st][sc];
						perc=(double)total/3;
						
					}
					System.out.println("\n Total scores:" +total);
					System.out.println("Percentage:" +perc);
					total=0;
				}
				System.out.println();
			}
			break;
		}

	}

}
