class TaskItem
{
    public string Name { get; set; }
    public string Priority { get; set; }

    public override string ToString()
    {
        return $"{Name} ({Priority})";
    }
}