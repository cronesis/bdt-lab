data()

data("mtcars")
View(mtcars)
nrow(mtcars)
ncol(mtcars)

ifelse(sum(mtcars$am)>nrow(mtcars)/2, "more manual", "more automatic")

scatter.smooth(mtcars$hp, mtcars$wt)

newmtc = transform(mtcars, am = as.integer(am), cyl = as.integer(cyl), vs = as.integer(vs))

mtcars[(mtcars$cyl < 5),]