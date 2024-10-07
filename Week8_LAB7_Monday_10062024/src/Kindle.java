public class Kindle {

    private int totalPages;
    private int currentPage;

    public Kindle (int numberOfPages){

        totalPages = numberOfPages;
        currentPage = 1;

    } // end of the constructor

    public String toString(){
        return "Page " + currentPage + " of " + totalPages;
    } // end of the toString method

    public void turnPages(){
        //your code here

        turnPages(1);

    }

    public void turnPages (int numberOfPages){
        // your code here
        if ( currentPage + numberOfPages > totalPages){
            System.out.println("You were on " + toString());
            System.out.println("Turning " + numberOfPages + " would ...");
            currentPage = totalPages;
            System.out.println("You are not on " + toString());
        }else{

            currentPage = currentPage + numberOfPages;

        }

    }

} //end of the Kindle class
