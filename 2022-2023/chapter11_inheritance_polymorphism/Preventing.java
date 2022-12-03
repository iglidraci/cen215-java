public class Preventing {
}

final class SporadicDisease {
    // you cannot inherit this class
}

class ChessAlgorithm {
    // you cannot override a final method
    // final methods are critical to the consistent state of the object
    final String getFirstPlayer() {
        return "white";
    }
}