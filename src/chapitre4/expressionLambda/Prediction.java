package chapitre4.expressionLambda;

@FunctionalInterface
public interface Prediction {
	
	public boolean test(String mot);

}
