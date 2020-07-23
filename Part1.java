
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna) {//AATGCTGGAATCGTAATATGGT
        int startIndex = dna.indexOf("ATG");//1
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);//13
        if ((stopIndex - startIndex) % 3 == 0) {//(13 - 1) % 3 == 0 true
            return dna.substring(startIndex, stopIndex+3);//ATGCTGGAATCGTAA
        }
        else {
            return "";
        }
    }
    
    public void testSimpleGene() {
        String dna = "AATGCTGGAATCGTAATATGGT"; //multiples of 3
        System.out.println("DNA strand is " + dna);
	String gene = findSimpleGene(dna);
	System.out.println("Gene is ATGCTGGAATCGTAA: " + gene);

	dna = "CGATGGTTCCTATCTG"; //no TAA
	System.out.println("DNA strand is " + dna);
	gene = findSimpleGene(dna);
	System.out.println("Gene is " + gene);

	dna = "AAATGCCCTAACTAGATTAAGAAACC"; //
	System.out.println("DNA strand is " + dna);
	gene = findSimpleGene(dna);
	System.out.println("Gene is from test " + gene);

	dna = "TTCCGTAGCAAATAA"; //no ATG
	System.out.println("DNA strand is " + dna);
	gene = findSimpleGene(dna);
	System.out.println("Gene is " + gene);
	
	dna = "CGATCGGAAATTGGTTTG"; //no ATG and no TAA
	System.out.println("DNA strand is " + dna);
	gene = findSimpleGene(dna);
	System.out.println("Gene is " + gene);
	

    }
}
