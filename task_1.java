@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean actual = true;
	assertEquals("Пользователь слишком молодой", actual, isAdult); // Напиши код здесь
}
