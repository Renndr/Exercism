class ResistorColorDuo {

    private enum Colors {
        BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
    }

    int value(String[] colors) {
        Colors firstColor = Colors.valueOf(colors[0].toUpperCase());
        Colors secondColor = Colors.valueOf(colors[1].toUpperCase());
        return firstColor.ordinal() * 10 + secondColor.ordinal();
    }

}

class test {
    public static void main(String[] args) {
        ResistorColorDuo resistorColorDuo = new ResistorColorDuo();
        System.out.println(resistorColorDuo.value(new String[] { "red", "orange", "yellow" }));
    }
}