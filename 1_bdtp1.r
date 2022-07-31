n = as.integer(readline())

USN = vector(mode="character", length= n)
Name = vector(mode="character", length= n)
Marks = vector(mode="numeric", length= n)

for (i in 1:n) {
  USN[i] <- as.character(readline())
  Name [i] <- as.character(readline())
  Marks[i] <- as.numeric(readline())
}

Student <- data.frame(USN, Name, Marks)

Age <- vector(mode = "numeric", length = n)
for (i in 1:n)
  Age [i] <- as.numeric(readline())

Student <- cbind(Student, Age)
summary(Student)

Student[(Student$Age<20)&(Student$Marks>25),2]
