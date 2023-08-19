# SQL problem by hackerrank ##

> Question

Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.

- ans 

```
SELECT * FROM CITY
WHERE COUNTRYCODE = "USA" AND POPULATION > 100000;
```

> Question

Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.

```
SELECT NAME FROM CITY 
WHERE COUNTRYCODE = "USA" AND POPULATION > 120000;
```

> Question

Query all columns (attributes) for every row in the CITY table.

```
SELECT * FROM City;
```
> QUESTION

Query all columns for a city in CITY with the ID 1661.

- ans
```
SELECT * FROM City
WHERE ID = "1661";

```

> QUESTION

Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.

[TABLE ](https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg "STATION")

- ans 
```
SELECT NAME FROM CITY
WHERE COUNTRYCODE = "JPN";

```

> QUESTION

Query a list of CITY and STATE from the STATION table.
- ans
```
SELECT CITY, STATE FROM STATION;

```


