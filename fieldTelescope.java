public class fieldTelescope   {

//A class that models a field telescope.

//private instance variables
private double diameter;
private double mainLength;
private double eyeLength;


//Constructor

public Telescope ( double d,double m,double e){

    }
// Accessors (These methods retrieve information without changing it)


// Mutators (These methods change information related to an object)


// Methods: Note these methods are not static because they are associated with a class

// calculate the magnification or power of the telescope
//The formula to use is: magnification = mainLength/eyeLength 

public double  calcMagnification(){
return mainLength/eyeLength;
}


// calculate the f-number of the telescope
//The formula to use is: fNumber = mainLength/diameter 

public double  calcFNumber(){


}
// return a String with diameter, mainLength, and eyeLength
public String toString() { 
 }
}
