n = as.integer(readline())

EmpID = vector(mode = "integer", length = n)
EmpName = vector(mode = "character", length = n)
DOJ = vector(mode = "character", length = n)
Dept = vector(mode = "character", length = n)
Desig = vector(mode = "character", length = n)

for (i in 1:n) {
    EmpID[i] = as.integer(readline())
    EmpName [i] = readline()
    DOJ[i] = readline()
    Dept [i] = readline()
    Desig[i] = readline()
}

DOJ = as.Date(DOJ, format="%Y-%m-%d")

Employee = data.frame(EmpID, EmpName, DOJ, Dept, Desig)

write.csv(Employee, "C:\\Users\\pradh\\Downloads\\bdtp2.csv", row.names=FALSE)

empcsv = read.csv("C:\\Users\\pradh\\Downloads\\bdtp2.csv")
print(empcsv)

newrow = data.frame(2,'arko','2004-02-21','devops','senior architect')
write.table(newrow, file = "C:\\Users\\pradh\\Downloads\\bdtp2.csv", sep = "," 
            ,append = TRUE, col.names = FALSE, row.names = FALSE)

empcsv = read.csv("C:\\Users\\pradh\\Downloads\\bdtp2.csv")
print(empcsv)
