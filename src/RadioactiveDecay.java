/**
 * File: RadioactiveDecay.java
 * ----------------------------
 * 4.
 * I shall never believe that God plays dice with the world.
 * —Albert Einstein, 1947
 * Despite Einstein’s metaphysical objections, the current models of physics, and
 * particularly of quantum theory, are based on the idea that nature does indeed
 * involve random processes. A radioactive atom, for example, does not decay for
 * any specific reason that we mortals understand. Instead, that atom has a
 * random probability of decaying within a period of time. Sometimes it does,
 * sometimes it doesn’t, and there is no way to know for sure.
 * Because physicists consider radioactive decay a random process, it is not
 * surprising that random numbers can be used to simulate the process. Suppose
 * you start with a collection of atoms, each of which has a certain probability of
 * decaying in any unit of time. You can then approximate the decay process by
 * taking each atom in turn and deciding randomly whether it decays, considering
 * the probability.
 * Write a program that simulates the decay of a sample that contains 10,000
 * atoms of radioactive material, where each atom has a 50 percent chance of
 * decaying in a year. The output of your program should show the number of
 * atoms remaining at the end of each year, which might look something like this:
 * RadioactiveDecay
 * There are 10000 atoms initially
 * There are 4969 atoms at the end of year 1
 * There are 2464 atoms at the end of year 2
 * There are 1207 atoms at the end of year 3
 * There are 627 atoms at the end of year 4
 * There are 311 atoms at the end of year 5
 * There are 166 atoms at the end of year 6
 * There are 89 atoms at the end of year 7
 * There are 40 atoms at the end of year 8
 * There are 21 atoms at the end of year 9
 * There are 9 atoms at the end of year 10
 * There are 5 atoms at the end of year 11
 * There are 2 atoms at the end of year 12
 * There are 0 atoms at the end of year 13
 * As the numbers indicate, roughly half the atoms in the sample decay each year.
 * In physics, the conventional way to express this observation is to say that the
 * sample has a half-life of one year.
 * */
import acm.program.ConsoleProgram;

public class RadioactiveDecay extends ConsoleProgram {

    private static int nAtoms_NOT_Radioactive;
}
