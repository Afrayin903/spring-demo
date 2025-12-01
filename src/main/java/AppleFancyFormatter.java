public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String format(Apple apple) {

        String category =
                (apple.getWeight() < 100) ? "LIGHT" : (apple.getWeight() > 150) ? "HEAVY"
                        : "LIGHT";
        String weight = "An apple of " + apple.getWeight();

        return switch (category) {
            case "LIGHT" -> "A Light " + apple.getColor() + " apple. " + weight;
            case "HEAVY" -> "A Heavy " + apple.getColor() + " apple. " + weight;
            default       -> "A Mid Light " + apple.getColor() + " apple. " + weight;
        };
//       if(apple.getWeight() < 100){
//            return  "A Light " + apple.getColor() + " apple";
//        }else if(apple.getWeight() < 150 && apple.getWeight() > 100){
//            return  "A Light " + apple.getColor() + " apple";
//        }else
//            return "A Heavy " + apple.getColor() + " apple";
    }
}
