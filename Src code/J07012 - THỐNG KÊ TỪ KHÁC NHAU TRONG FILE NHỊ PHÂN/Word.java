package J07012;

public class Word implements Comparable<Word>
{
    private String word;
    private int f;

    public Word(String word, int f)
    {
        this.word = word;
        this.f = f;
    }
    
    @Override
    public String toString()
    {
        return word + " " + f;
    }

    @Override
    public int compareTo(Word o)
    {
        if (f != o.f)
            return o.f - f;
        return word.compareTo(o.word);
    }
}
