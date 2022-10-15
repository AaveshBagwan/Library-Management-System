public class Management {

        String[] books = new String[20];
        String[] authors = new String[20];
        String[] issued_books = new String[20];
        String[] users = new String[20];
        public int s=0;
        public int u=0;

        public int n = 0 ;
        public void add_books(String book_name, String author_name)
        {
            books[n] = book_name ;
            authors[n] = author_name ;
            n++ ;
        }

        public void show_available_books()
        {
            System.out.println("\n"+"books"+" : "+"authors"+"\n");


            for(int i=0; i<n; i++)
            {
                if(books[i].equalsIgnoreCase("issued"))
                {
                    continue;
                }
                System.out.println("--> "+""+books[i]+" : "+authors[i]);
            }
        }

        public void issue_book(String book_name, String your_full_name)
        {
            int check2 = 0;

            if(s!=0)
            {
                int check = 0;
                for(int k = 0; k < s; k++)
                {
                    if(your_full_name.equalsIgnoreCase(users[k]))
                    {
                        check++;
                    }
                }

                if (check>=1)
                {
                    System.out.format("\n\"%s\" You Have Already Accessed a Book Please Return Them First\n",your_full_name);
                    check2++;

                }
            }


            if( check2 == 0)
            {

                int flag = 0;
                for (int i = 0; i < n; i++)
                {
                    if (book_name.equalsIgnoreCase(books[i]))
                    {
                        System.out.format("\nThe Book \" %s \" Has Been Successfully Issued by : %s \n", books[i], your_full_name);
                        flag = 1;

                        int flag2 = 0;

                        if (s != 0)
                        {
                            for(int m=0; m<s; m++)
                            {
                                if(issued_books[m].equalsIgnoreCase("returned") )
                                {
                                    issued_books[m] = books[i];
                                    users[m] = your_full_name;
                                    flag2 = 1;
                                    break;
                                }
                            }
                            if(flag2==0)
                            {
                                issued_books[s] = books[i];
                                users[s] = your_full_name;
                                s++;
                            }
                        }

                        if(s==0)
                        {
                            issued_books[0] = books[i];
                            users[0] = your_full_name;
                            s++;
                        }

                        books[i] = "issued";
                        break;

                    }
                }

                if(flag == 0)
                {
                    System.out.println("\nSorry but book is not available\n");
                }

            }

        }

        public void return_book( String book_name, String name, String author )
        {
            int h = 0;
            for(int j=0; j<s; j++)
            {

                if(book_name.equalsIgnoreCase(issued_books[j]) & name.equalsIgnoreCase(users[j]))
                {
                    add_books(book_name, author);
                    System.out.format("\nThe Book \" %s \" Has Been Successfully Returned by : %s\n", book_name, name);
                    issued_books[j] = "returned";
                    users[j] = "returned";
                    h++;
                    break;
                }
            }
            if(h==0)
            {
                System.out.println("\n1) Book Is Not Issued ");
                System.out.println("2) User Have Not Issued Any Book");
                System.out.println("3) User Have Have Issued Any Other Book");

                System.out.println("\nNOTE : If You Want To Add New Book Then Try Using Add Method");
            }

        }

    }

