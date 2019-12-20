package com.collabera.mongo;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoTestDB {
	private MongoClient mongo = null;
	public MongoDatabase connectToMongo() {
		//Create a mongo client
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		//Create Credentials 
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "mydb", "password".toCharArray());
		System.out.println("Connected to the database successfully");
		
		//Accessing the database
		MongoDatabase database = mongo.getDatabase("mydb");
		System.out.println("Database :" + database.getName());
		return database;
	}
	public void createCollection(MongoDatabase database) {
		//Creating a collection
		database.createCollection("sampleCollection");
		System.out.println("Collection created successfully");
	}
	public void dropCollection(MongoCollection<Document> collection) {
		//Dropping a collection
		collection.drop();
		System.out.println("Collection dropped successfully");
	}
	public void listCollections(MongoDatabase database) {
		for(String name: database.listCollectionNames()) {
			System.out.println(name);
		}
	}
	public MongoCollection<Document> retrieveCollection(MongoDatabase database, String collectionName) {
		//Retrieving a collection
		MongoCollection<Document> collection = null;
		try {
			collection = database.getCollection(collectionName);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}return collection;
	}
	public void insertDocument(MongoCollection<Document> collection) {
		//Inserting a document
		Document doc = new Document("title", "MongoDB")
			.append("id", 2)
			.append("description", "database")
			.append("likes", 101)
			.append("url", "http:///www.collabera.com/mongodb/")
			.append("by", "collabera");
		collection.insertOne(doc);
		System.out.println("Document successfully inserted");
	}
	public void retrieveAllDocuments(MongoCollection<Document> collection) {
		//Retrieve all documents
		//Getting the iterable object
		FindIterable<Document> iterDoc = collection.find();
		int i = 0;
		//Getting the iterator
		Iterator it = iterDoc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
		System.out.println("Total number of Documents: " + i);
	}
	public void updateDocument(MongoCollection<Document> collection) {
		try {
			collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));
			System.out.println("Document updated successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void deleteDocument(MongoCollection<Document> collection) {
		try {
			collection.deleteOne(Filters.eq("id", 2));
			System.out.println("Document deleted successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void finalize() {
		mongo.close();
	}
	public static void main(String[] args) {
		MongoTestDB mongoApp = new MongoTestDB();
		MongoDatabase database = mongoApp.connectToMongo();
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		
		mongoApp.insertDocument(collection);
		mongoApp.retrieveAllDocuments(collection);
		
		mongoApp.updateDocument(collection);
		mongoApp.retrieveAllDocuments(collection);
		
		mongoApp.deleteDocument(collection);
		mongoApp.retrieveAllDocuments(collection);
		
		mongoApp.dropCollection(collection);
		mongoApp.listCollections(database);
		
	}	
}
