# Notes

## GraphQL Types

- ID -> Id field
- ! -> not null

## GraphQL Return Type

- Query -> type Query {}
- Structure -> function_name(parameter: parameter type): return type
	- Example: getUsersByCountry(country: String): [User]
	- In the above [User] means array of User

- Mutation -> type Mutation {}
- Structure -> function_name(parameter: parameter type): return type

## Creating API:
1. All Fetch APIs will be annotated with @QueryMapping("allBooks").
2. All Mutation APIs will be annotated with @MutationMapping("createBook")
3. For request body or any other parameter, use @Argument


## API Call

Call the API: POST http://localhost:8080/graphql

With body:

```js
query{
    allBooks(){
        id
        title
    }
}
```

#### For Parameter

```js
query{
    getBook(bookId:4){
        title
        author
    }
}
```

#### Mutation

```js
mutation {
	createBook(book: {
		title: "My Title",
		author: "Author",
		price: 45.5,
		pages: 45
	}){
		id
		title
	}
}
```