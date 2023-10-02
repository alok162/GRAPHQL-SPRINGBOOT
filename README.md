# GRAPHQL-SPRINGBOOT


# QUERY:

query bookDetails {
  bookById(id: "2") {
    id
    name
    pageCount
    author {
      id
      firstName
      lastName
    }
  }
}

mutation {
    updateBook(id:2, name: "Java World v3") {
        id
        name
    }
}
