# MongoDB Labs - Restaurant Database Query Exercises

A comprehensive collection of MongoDB query exercises using a restaurant database. These labs cover fundamental to advanced MongoDB query operations, filtering, sorting, and data manipulation techniques.

## Overview

This collection contains 10 Jupyter notebooks with MongoDB query exercises designed to practice and master MongoDB query syntax and operations. All exercises work with a `restaurants` collection containing restaurant data with fields like name, borough, cuisine, address, grades, and more.

## Lab Structure

### 1. Basic Retrieval (`1.basic-retrieval.ipynb`)
**Topics Covered:**
- Displaying all documents in a collection
- Projection: selecting specific fields
- Excluding the `_id` field from results
- Accessing nested fields (e.g., `address.zipcode`)

**Key Queries:**
- `db.restaurants.find()` - Retrieve all documents
- `db.restaurants.find({}, {field:1})` - Project specific fields
- `db.restaurants.find({}, {_id:0})` - Exclude _id field

### 2. Location Filtering (`2.location-filtering.ipynb`)
**Topics Covered:**
- Filtering by borough
- Filtering by nested address fields (coordinates, street, zipcode)
- Basic equality matching

**Key Concepts:**
- Simple field matching
- Nested document field access using dot notation
- Geographic data filtering

### 3. Score-Based Filtering (`3.score-based-filtering.ipynb`)
**Topics Covered:**
- Filtering by grade scores
- Using comparison operators (`$gt`, `$lt`)
- Working with array elements
- Combining multiple conditions

**Key Operators:**
- `$gt` - Greater than
- `$lt` - Less than
- Array element matching

### 4. Geo-Cuisine Filtering (`4.geo-cuisine-filtering.ipynb`)
**Topics Covered:**
- Filtering by cuisine type
- Geographic coordinate filtering
- Combining location and cuisine criteria
- Working with nested coordinate arrays

**Key Concepts:**
- Multiple field matching
- Coordinate-based queries
- Cuisine classification filtering

### 5. Borough Filtering (`5.borough-filtering.ipynb`)
**Topics Covered:**
- Using `$in` operator for multiple values
- Using `$nin` operator for exclusion
- Borough-based filtering

**Key Operators:**
- `$in` - Match any value in array
- `$nin` - Match none of the values in array

**Example Queries:**
```javascript
// Restaurants in specific boroughs
db.restaurants.find({ 
  borough: { $in: ["Staten Island", "Queens", "Bronx", "Brooklyn"] } 
})

// Restaurants NOT in specific boroughs
db.restaurants.find({ 
  borough: { $nin: ["Staten Island", "Queens", "Bronx", "Brooklyn"] } 
})
```

### 6. Name Pattern Matching - Regex (`6.name-pattern-matching-regex.ipynb`)
**Topics Covered:**
- Regular expression pattern matching
- Case-sensitive and case-insensitive searches
- Pattern matching with `$regex`
- String starts-with and contains operations

**Key Concepts:**
- `$regex` operator
- Pattern matching for text search
- Name-based filtering

### 7. Combined and Complex Conditions (`7.combined-and-complex-conditions.ipynb`)
**Topics Covered:**
- Logical operators (`$and`, `$or`, `$not`)
- Complex multi-field queries
- Combining multiple conditions
- Nested logical operations

**Key Operators:**
- `$and` - All conditions must be true
- `$or` - At least one condition must be true
- `$not` - Negation operator

**Example Patterns:**
```javascript
// Multiple conditions with AND
db.restaurants.find({ 
  $and: [
    { cuisine: "American" },
    { borough: "Brooklyn" }
  ]
})

// Multiple conditions with OR
db.restaurants.find({ 
  $or: [
    { cuisine: "Italian" },
    { borough: "Manhattan" }
  ]
})
```

### 8. Array and Date Queries (`8.array-date-queries.ipynb`)
**Topics Covered:**
- Querying array fields
- Array element matching
- Array size operations
- Date-based filtering
- Working with the `grades` array

**Key Concepts:**
- Array field queries
- `$elemMatch` for complex array queries
- Date comparison operations
- Grade and rating analysis

### 9. Sorting (`9.sorting.ipynb`)
**Topics Covered:**
- Ascending sort (1)
- Descending sort (-1)
- Multi-field sorting
- Sort order precedence

**Key Operations:**
```javascript
// Sort by name ascending
db.restaurants.find({}).sort({ name: 1 })

// Sort by name descending
db.restaurants.find({}).sort({ name: -1 })

// Multi-field sort: cuisine ascending, borough descending
db.restaurants.find({}).sort({ cuisine: 1, borough: -1 })
```

### 10. Miscellaneous (`10.miscellaneous.ipynb`)
**Topics Covered:**
- Advanced query techniques
- Aggregation basics
- Additional MongoDB operations
- Complex query combinations

## Prerequisites

- MongoDB installed and running
- Jupyter Notebook or JupyterLab
- Python with `pymongo` library (if using Python kernel)
- Restaurant sample database loaded

## Database Schema

The `restaurants` collection contains documents with the following structure:

```javascript
{
  "_id": ObjectId,
  "restaurant_id": String,
  "name": String,
  "borough": String,
  "cuisine": String,
  "address": {
    "building": String,
    "coord": [Number, Number],
    "street": String,
    "zipcode": String
  },
  "grades": [
    {
      "date": ISODate,
      "grade": String,
      "score": Number
    }
  ]
}
```

## Getting Started

1. **Load the Sample Database:**
   ```bash
   mongoimport --db test --collection restaurants --file restaurants.json
   ```

2. **Open Jupyter Notebooks:**
   ```bash
   jupyter notebook
   ```

3. **Navigate through labs sequentially** (1-10) for progressive learning

4. **Execute queries** in MongoDB shell or through the notebook interface

## Key MongoDB Concepts Covered

### Query Operators
- **Comparison:** `$eq`, `$gt`, `$gte`, `$lt`, `$lte`, `$ne`, `$in`, `$nin`
- **Logical:** `$and`, `$or`, `$not`, `$nor`
- **Element:** `$exists`, `$type`
- **Array:** `$elemMatch`, `$size`, `$all`
- **Evaluation:** `$regex`, `$text`, `$where`

### Query Techniques
- Field projection
- Nested document queries
- Array queries
- Regular expressions
- Sorting and limiting results
- Complex conditional logic

## Learning Path

**Beginner:**
1. Start with Lab 1 (Basic Retrieval)
2. Progress to Lab 2 (Location Filtering)
3. Practice Lab 3 (Score-Based Filtering)

**Intermediate:**
4. Lab 4 (Geo-Cuisine Filtering)
5. Lab 5 (Borough Filtering)
6. Lab 6 (Regex Pattern Matching)

**Advanced:**
7. Lab 7 (Complex Conditions)
8. Lab 8 (Array and Date Queries)
9. Lab 9 (Sorting)
10. Lab 10 (Miscellaneous)

## Tips for Success

1. **Practice Each Query:** Type out queries manually rather than copy-pasting
2. **Experiment:** Modify queries to see different results
3. **Understand Operators:** Learn when to use each operator
4. **Read Documentation:** Refer to MongoDB official docs for deeper understanding
5. **Test Variations:** Try different field combinations and conditions

## Common Query Patterns

### Find with Projection
```javascript
db.restaurants.find(
  { borough: "Manhattan" },
  { name: 1, cuisine: 1, _id: 0 }
)
```

### Complex Filtering
```javascript
db.restaurants.find({
  $and: [
    { cuisine: "Italian" },
    { "address.zipcode": "10075" },
    { "grades.score": { $gt: 30 } }
  ]
})
```

### Regex Search
```javascript
db.restaurants.find({
  name: { $regex: /^Wil/, $options: "i" }
})
```

## Additional Resources

- [MongoDB Official Documentation](https://docs.mongodb.com/)
- [MongoDB Query Operators Reference](https://docs.mongodb.com/manual/reference/operator/query/)
- [MongoDB University](https://university.mongodb.com/) - Free courses

## Author

Aakash Joshi

## License

This project is for educational purposes.

---

**Note:** These exercises are designed to build MongoDB querying skills progressively. Complete them in order for the best learning experience.
