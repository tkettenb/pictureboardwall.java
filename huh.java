enum SomeEnum {
    EN_ACTION_1, EN_ACTION_2, EN_NO_ACTION, EN_HAH_ALL_GOOD
};

public class huh {
    public static final void main(String[] args) {
        SomeEnum myEnum = SomeEnum.EN_HAH_ALL_GOOD;
        System.out.println("My enum is: " + myEnum);
        int a = 1 / 0;
    }
}
