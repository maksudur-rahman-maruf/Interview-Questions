#include<stdio.h>
#include<stdbool.h>

int node;

void DFSUtil(int u, int **adj, bool visited[])  // we can also  use  *visited instead of visited[]//
{
    visited[u] = true;
    printf("%d ",u);

    int i=0;
    for(i=0; i<node; i++)
    {
        if(visited[u] == false && adj[u][i]==1)
            DFSUtil(i, adj, visited);

    }
}


void DFS (int **adj, int node)
{
    int i;
    bool visited[node];
    memset(visited, false, node*sizeof(bool));
    for(i=0; i<node; i++)
    {
        if(visited[i] == false)
            DFSUtil(i, adj, visited);
    }
}

int main()
{

    scanf("%d",&node);

    int adj[node][node];

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

    DFS(adj, node);

}

