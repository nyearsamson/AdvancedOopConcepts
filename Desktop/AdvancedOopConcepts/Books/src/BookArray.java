public class BookArray {

    public static void main(String[] args) {
        
        //Creating Book array which stores Fiction and Non-Fiction Book Objects
        Book bookArray[]={new Fiction("Dune"),
                            new Fiction("The Alchemist"),
                            new Fiction("Animal Farm"),
                            new Fiction("The Bell Jar"),
                            new Fiction("A Game of Thornes"),
                            new NonFiction("Homage to Catlonia"),
                            new NonFiction("In Cold Blood"),
                            new NonFiction("Out Of Africa"),
                            new NonFiction("Never Cry Wolf"),
                            new NonFiction("Night")};

        //This for loop will displays the Each Fiction and Non-Fiction book details
        for(int i=0;i<bookArray.length;i++)
        {
            //Displaying the information of each book
            System.out.println(bookArray[i].toString());
        }
    }

}
