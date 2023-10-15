class ResistorColor {

    int colorCode(String color) {
        String colors[] = colors();
        int index = 0;
        for (int i = 0; i <= colors.length; i++) {
            if (colors[i].equals(color)) {
                index = i;
                break;
            }
        }
        return index;
    }

    String[] colors() {
        String colors[] = new String[10];
        colors[0] = "black";
        colors[1] = "brown";
        colors[2] = "red";
        colors[3] = "orange";
        colors[4] = "yellow";
        colors[5] = "green";
        colors[6] = "blue";
        colors[7] = "violet";
        colors[8] = "grey";
        colors[9] = "white";

        return colors;
    }
}