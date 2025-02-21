package OOP.L01_WorkingWithAbstraction.Exercise;

public enum Role {



    ADMIN(true),
    USER(false),
    SUPPORT(false);

    private boolean isAccessAllowed;

   Role(boolean isAccessAllowed) {
       this.isAccessAllowed = isAccessAllowed;
   }

    @Override
    public String toString() {
        return System.out.printf("my role is: %s", Role.ADMIN).toString();
    }
}
