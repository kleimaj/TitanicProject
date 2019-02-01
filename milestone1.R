library(igraph)
titanic_network <- read.csv("titanic.csv",
                          header = TRUE)
#add edges
g <- graph.data.frame(titanic_network)
plot(g)
