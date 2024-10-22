public class PDPL {
    private String geekName;
    private int geekRoll;
    private int geekAge;

	//Metode Getter
    public int getAge() { 
        return geekAge; 
    }

    public String getName() { 
        return geekName; 
    }

    public int getRoll() { 
        return geekRoll; 
    }
    
	//Metode Setter
    public void setAge(int newAge) { 
        geekAge = newAge;     
    }

    public void setName(String newName) {
        geekName = newName;
    }

    public void setRoll(int newRoll) {
				 geekRoll = newRoll;
    }

}