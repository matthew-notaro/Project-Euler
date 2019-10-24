//I made a separate class to make the Main smaller, to increase ease of reading, and to keep everything organized with their own methods.
public class Triangle {
  public int small;
  public int med;
  public int hyp;
  
  //sorts the sides by length
  public Triangle(int s1, int s2, int s3) {
    
    //if input1 is the largest
    if (s1 > s2 && s1 > s3) {
      hyp = s1;
      if(s2 > s3) {
        med = s2;
        small = s3;
      }
      else {
        med = s3;
        small = s2;
      }
    }
    
    //if input2 is the largest
    else if (s2 > s1 && s2 > s3) {
      hyp = s2;
      if(s1 > s3) {
        med = s1;
        small = s3;
      }
      else {
        med = s3;
        small = s1;
      }
    }
    
    //if input3 is the largest
    else {
      hyp = s3;
      if(s2 > s1) {
        med = s2;
        small = s1;
      }
      else {
        med = s1;
        small = s2;
      }
    }
  }
  
  //checks if input is right triangle with pythag theorum
  public boolean isValid() {
    return (small*small + med*med) == hyp*hyp;
  }

  //calculates total average probability using many points
  public double calculate() {
    double sum = 0;
    // need to keep track of the number of points checked to divide by that number later
    int numPoints = 0;
    for (double x = 0.01; x < small; x += 0.01) {
      
      //must stay inside the triangle by using a proportion between med length and small length to find the slope of the hypot
      double height = med - x * med/small;
      
      for (double y = 0.01; y < height; y += 0.01) {
         sum += singleProb(x, y);
         numPoints++;
      }
    }
  //returns average probability
  return sum / numPoints;
  }
  
  //using much trig, calculates the probability of the ant walking towards the hypot from a single point
  public double singleProb(double x, double y) {
    return (Math.PI / 2 + Math.atan(x / (med - y)) + Math.atan(y / (small - x))) / (2 * Math.PI );
  }
}

/*

|\
| \
|  \
|   \
|    \
med   \ hyp
|      \
|       \
|        \
|         \
---small---

*/
