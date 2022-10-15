import java.util.Scanner;

public class Library {

        public static void main(String[] args) {

            System.out.println("\n\nThere Can Only 20 Books Present at once In our Library");
            System.out.println("One User can Access Only One Book at a Time\n\n");

            Management l1 = new Management();

            l1.add_books("Rich Dad Poor Dad", "Robert Kiyosaki");
            l1.add_books("sapiens", "yuval noah harari");
            l1.add_books("electrical circuit", "alexander sadiku");

            System.out.println("========================================================");
            System.out.println("***************** WELCOME TO OUR LIBRARY ***************");
            System.out.println("========================================================");
            System.out.println("\n\nWhat You Want To Do\n");
            System.out.println("Enter 1 for : Showing Available Books From Library ");
            System.out.println("Enter 2 for : Adding new Books To Library");
            System.out.println("Enter 3 for : Issuing Book from The Library");
            System.out.println("Enter 4 for : Returning Issued Book To The Library");
            System.out.println("Enter 5 for : Exit");

            while(true)
            {
                System.out.print("\nEnter : ");
                Scanner sc = new  Scanner(System.in);
                int enter= sc.nextInt();

                switch (enter) {
                    case 1:
                        l1.show_available_books();
                        break;
                    case 2:
                        int num2=0;
                        int k2=0;
                        System.out.print("\nHow Many Books You Want To Add : ");
                        num2 = sc.nextInt();

                        while(k2 < num2 )
                        {
                            System.out.println("\n=========================================================");
                            System.out.println("                Enter Details of Book "+(k2+1)              );
                            System.out.println("=========================================================\n");
                            String name2 = sc.nextLine();

                            System.out.print("Enter Name of Book You Want To Add : ");
                            String book2 = sc.nextLine();

                            System.out.print("Enter Name of Author : ");
                            String name22 = sc.nextLine();
                            System.out.println();

                            l1.add_books(book2, name22);
                            k2++;
                        }
                        break;
                    case 3:
                        int num3=0;
                        int k3=0;
                        System.out.print("\nHow Many Books You Want To Issue : ");
                        num3 = sc.nextInt();

                        while(k3<num3)
                        {
                            String book3;
                            String name3;

                            System.out.println("\n==========================================================");
                            System.out.println("                Enter Details of Book "+(k3+1)                );
                            System.out.println("===========================================================\n");
                            String name33 = sc.nextLine();

                            System.out.print("Enter Name of Book You Want To Issue : ");
                            book3 = sc.nextLine();

                            System.out.print("Enter Your Name Who Wants To Issue Book : ");
                            name3 = sc.nextLine();

                            l1.issue_book(book3, name3);
                            k3++;
                        }
                        break;
                    case 4:
                        int num4=0;
                        int k4=0;
                        System.out.print("\nHow Many Books You Want To Return : ");
                        num4 = sc.nextInt();

                        while(k4<num4)
                        {
                            String book4;
                            String name4;
                            String author4;


                            System.out.println("\n=========================================================");
                            System.out.println("                Enter Details of Book "+(k4+1)              );
                            System.out.println("=========================================================\n");

                            String name44 = sc.nextLine();


                            System.out.print("Enter Name of Book You Want To Return : ");
                            book4 = sc.nextLine();

                            System.out.print("Enter Your Name Who Wants To Return Book : ");
                            name4 = sc.nextLine();

                            System.out.print("Enter Author of book : ");
                            author4 = sc.nextLine();

                            l1.return_book(book4,name4,author4);
                            k4++;
                        }
                        break;
                    case 5:
                        System.out.println("\n\n=========================================================");
                        System.out.println("              Thanks For Visiting Library                   ");
                        System.out.println("==========================================================\n\n");
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + enter);
                }

                if (enter==5)
                {
                    break;
                }


            }
        }
    }

