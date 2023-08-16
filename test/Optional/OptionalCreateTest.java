package Optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalCreateTest {

    @Test
    public void whenCreatesEmptyOptional_thenCorrect() {
        Optional<String> empty = java.util.Optional.empty();
        assertTrue(empty.isPresent()); // false 반대는 isEmpty()
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "test";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name ="khm";
        Optional<String> opt = Optional.ofNullable(name);
        assertTrue(opt.isPresent());
    }

    @Test
    public void givenNull_whenCreatesNullable_thenCorrect() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertFalse(opt.isPresent());
    }


}
