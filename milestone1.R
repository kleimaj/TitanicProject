library(igraph)
titanic_network <- read.csv("titanic.csv",
                          header = TRUE)
#add edges
edgelist <- read.csv("edgelist.txt", header = FALSE, sep = "\t")
g <- graph.data.frame(titanic_network)
plot(g)
