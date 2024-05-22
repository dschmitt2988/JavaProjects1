//program will determine whether there is protein in a strand of DNA

public class DNA {

  public static void main(String[] args) {
     //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna1;
    System.out.println(dna.length());
    System.out.println(dna.indexOf("ATG"));
    System.out.println(dna.indexOf("TGA"));
    
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
    
    if(start != -1 && stop != -1 && (start-stop) % 3 == 0){
      System.out.println("Condition 1 and 2 are satisfied.");

      String protein = dna.substring(start,stop+3);
      System.out.println("Protein: " + protein);
    } else System.out.println("No protein.");
  }

}