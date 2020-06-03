#include<bits/stdc++.h>
using namespace std;


void DFSUtil(int u, vector<int> adj[], vector<bool> &visited)
{
    visited[u] = true;
    printf("%d ",u);

    for(int i=0; i<adj[u].size(); i++)
    {
        if(visited[adj[u][i]] == false)
            DFSUtil(adj[u][i], adj, visited);
    }
}


void DFS (vector<int> adj[], int node)
{
    vector<bool> visited(node, false);
    for(int i=0; i<node; i++)
    {
        if(visited[i] == false)
            DFSUtil(i, adj, visited);
    }
}

int main()
{

    int node;
    scanf("%d",&node);

    vector<int> adj[node];

    int edge;
    scanf("%d",&edge);

    int start,end;
    for(int i=1; i<=edge; i++)
    {
        scanf("%d",&start);
        scanf("%d",&end);

        adj[start].push_back(end);
        adj[end].push_back(start);

    }

    DFS(adj, node);

}
