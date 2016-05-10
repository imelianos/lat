package AESimualtor;


class Random implements Constants{
	
	/*
	 * set randomness
	 */
	static double[] triageProbabilities= new double[]{0.20,0.30,0.60,0.7,1.0};




	
  static double exponential(double mean) {
        return - mean * Math.log(Math.random());
    }
  static boolean bernoulli(double p) {
    return Math.random() < p;
  }
  

  
  static void setPossibility(Constants.TriageTypes type, double probability){
	  
	  switch (type){
	  
	  case GREEN:
		  triageProbabilities[0] = probability;
			break;

	case BLUE:
		triageProbabilities[1] = probability;
			break;

	case ORANGE:
		triageProbabilities[2] = probability;
			break;

	case YELLOW:
		triageProbabilities[3] = probability;
			break;

	case RED:
		triageProbabilities[4] = probability;
			break;

	default:
		break;
		 
	  
	  }
  }
  
  static TriageTypes getRandomTriage(){
	  
	TriageTypes type= null;  
	
	double result = Math.random()*1.0;
	  

	if (result < triageProbabilities[0]){
		type=lookUpTriage(0);
		}
	else if((result < triageProbabilities[1])){
		type=lookUpTriage(1);

	}
	else if((result < triageProbabilities[2])){
		type=lookUpTriage(2);

	}
	
	else if((result < triageProbabilities[3])){
		type=lookUpTriage(3);

	}
	else if((result < triageProbabilities[4])){
		type=lookUpTriage(4);

	}

	return type;
	  
	  
  }
  

	static TriageTypes lookUpTriage(int i) {
	    return TriageTypes.values()[i];
	}
  
    

	
	
  }
  

