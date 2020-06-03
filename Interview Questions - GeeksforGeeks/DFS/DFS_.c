
#include<stdio.h>
#include<stdbool.h>

int node;
int adj[1000][1000];
bool visited[1000];

void DFSUtil(int u)
{
    visited[u] = true;
    printf("%d ",u);

    int i;
    for(i=0; i<node; i++)
    {
        if(visited[u] == false && adj[u][i]==1)
            DFSUtil(i);

    }
}


void DFS (int source)
{
    int i;


    for(i=source; i<node; i++) // we should put i = 0 // if source is not defined
    {
        if(visited[i] == false)
            DFSUtil(i);
    }
}

int main()
{
    ///memset(adj, false, 1000*sizeof(int));
    ///memset(visited, false, 1000*sizeof(bool));
    ///Initially we have to initialize all the arrays as 0 or false; // if we declare them in global scope/globally.
    scanf("%d",&node);

    int edge;
    scanf("%d",&edge);

    int i,start,end;
    for(i=1; i<=edge; i++)
    {
        scanf("%d",&start);
        scanf("%d",&end);

        adj[start][end] = 1;
        adj[end][start] = 1;

    }

    int source=0;

    DFS(source);

}

