class Badge {
    public String print(Integer id, String name, String department) {
        department = department == null ? "OWNER" : department.toUpperCase();
        name = name == null ? "" : name;

        if (id == null) {
            return name + " - " + department;
        }

        return "[" + id + "]"+ " - " + name + " - " + department;
    }
}