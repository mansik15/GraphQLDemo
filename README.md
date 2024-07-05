## Country List using GraphQl API
To implement GraphQL in this app, I have used Apollo GraphQL, a popular GraphQL client for Android and Java.

### Steps
- Add Apollo dependencies & plugins in your build.gradle.kts files
- Create a directory for GraphQL files named 'graphql' in your src/main directory.
- Add GraphQL queries & mutations
- Initialize Apollo client
- Execute graphql queries
- Handle UI updates

> [!IMPORTANT]
> GraphQL Apollo Doc reference: https://www.apollographql.com/docs/kotlin/<br>
  Download schema file from here: [SDL File](https://studio.apollographql.com/sandbox/schema/sdl?selectedSchema=%23%40%21api%21%40%23)<br>
  GraphQL API: https://countries.trevorblades.com/

> [!Tip]
> Use schema file with extension 'graphqls' if you are working with apollo 3.8.4 or higher
