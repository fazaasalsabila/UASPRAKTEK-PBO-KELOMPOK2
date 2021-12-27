public class TestProgram {

    public static void main(String[] args) {
            // membuat method Employee
            Employee[] emp = new Employee[9];
            
            // Staff
            emp[0] = new Staff(123, "Allen", "Paita", "M", "2/23/59", 50);
            emp[1] = new Staff(456, "Zapita", "Steven", "F", "7/12/64", 35);
            emp[2] = new Staff(789, "Rios", "Enrique", "F", "6/2/70", 40);
            // Faculty
            emp[3] = new Faculty(243,  "Jhonson", "Anne", "F", "4/27/62", Faculty.Level.FU, new Education("PhD", "Enginering", 3)) ;
            emp[4] = new Faculty(791, "Bouris", "William", "F", "3/14/75", Faculty.Level.AO, new Education("PhD" , "English", 1));
            emp[5] = new Faculty(623, "Andrade", "Christoper", "F", "5/22/80", Faculty.Level.AS, new Education("MS", "Computer science", 0));
            // Part-time
            emp[6] = new Partime(455, "Guzman", "Augusto", "F", "8/10/77", 35, 30);
            emp[7] = new Partime(678, "Depiro", "Martin", "F", "9/15/87", 30, 15);
            emp[8] = new Partime(945, "Aldaco", "Marque", "M", "11/24/88", 20, 35);

          
            
            double totalSalaryOfAll=0;
            double totalSalaryOfPartime=0;

           
            
           
            
            // a. Print out employee information
            System.out.println("EMPLOYEE's INFORMATION KELOMPOK 2 UAS OOP:\n\n\n");
            for(int i = 0; i < emp.length; i++) {
                    
                if (i==0){
                        System.err.println("Staff\n");
                }
                else if(i==3){
                        System.out.println("Faculty\n");
                }
                else if(i==6){
                        System.out.println("Part-Time\n");
                }
                
                System.out.println(emp[i].toString());
                    System.out.println();
                    totalSalaryOfAll+=emp[i].monthlyEarning();
                    
                    if (emp[i] instanceof Partime){
                            totalSalaryOfPartime+=emp[i].monthlyEarning();
                    }
                    
                }

                

                
                

                //b. 
                System.out.println("Total gaji bulanan Staff Part-Time :" + totalSalaryOfPartime +"\n");
                System.out.println("Total gaji bulanan Semua karyawan :" + totalSalaryOfAll +"\n");
            }
}
