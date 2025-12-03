public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String format(Apple apple) {

        String category =
                (apple.getWeight() < 100) ? "LIGHT" : (apple.getWeight() > 150) ? "HEAVY"
                        : "LIGHT";
        String appleWeight = "An apple of " + apple.getWeight() + "g";

        return switch (category) {
            case "LIGHT" -> "A Light " + apple.getColor() + " apple. " + appleWeight;
            case "HEAVY" -> "A Heavy " + apple.getColor() + " apple. " + appleWeight;
            default       -> "A Mid Light " + apple.getColor() + " apple. " +appleWeight;
        };
//       if(apple.getWeight() < 100){
//            return  "A Light " + apple.getColor() + " apple";
//        }else if(apple.getWeight() < 150 && apple.getWeight() > 100){
//            return  "A Light " + apple.getColor() + " apple";
//        }else
//            return "A Heavy " + apple.getColor() + " apple";
    }
}
