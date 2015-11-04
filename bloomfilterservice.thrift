struct Person 
{
	1: string firstName,
	2: string lastName,
	3: i32 age,
	4: string email
}

service BloomFilterService 
{
	// void add(1: string str);
	// bool contain(1: string str);
	void add(1: Person person);
	bool contain(1: Person person);
}