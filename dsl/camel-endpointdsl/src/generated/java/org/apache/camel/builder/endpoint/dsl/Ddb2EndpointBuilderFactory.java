/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Store and retrieve data from AWS DynamoDB service using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Ddb2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS DynamoDB component.
     */
    public interface Ddb2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDdb2EndpointBuilder advanced() {
            return (AdvancedDdb2EndpointBuilder) this;
        }
        /**
         * To use the AmazonDynamoDB as the client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.dynamodb.DynamoDbClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonDDBClient the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder amazonDDBClient(
                software.amazon.awssdk.services.dynamodb.DynamoDbClient amazonDDBClient) {
            doSetProperty("amazonDDBClient", amazonDDBClient);
            return this;
        }
        /**
         * To use the AmazonDynamoDB as the client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.dynamodb.DynamoDbClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonDDBClient the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder amazonDDBClient(String amazonDDBClient) {
            doSetProperty("amazonDDBClient", amazonDDBClient);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param consistentRead the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder consistentRead(boolean consistentRead) {
            doSetProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param consistentRead the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder consistentRead(String consistentRead) {
            doSetProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Set whether the initial Describe table operation in the DDB Endpoint
         * must be done, or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param enabledInitialDescribeTable the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder enabledInitialDescribeTable(
                boolean enabledInitialDescribeTable) {
            doSetProperty("enabledInitialDescribeTable", enabledInitialDescribeTable);
            return this;
        }
        /**
         * Set whether the initial Describe table operation in the DDB Endpoint
         * must be done, or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param enabledInitialDescribeTable the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder enabledInitialDescribeTable(
                String enabledInitialDescribeTable) {
            doSetProperty("enabledInitialDescribeTable", enabledInitialDescribeTable);
            return this;
        }
        /**
         * Attribute name when creating table.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyAttributeName the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder keyAttributeName(String keyAttributeName) {
            doSetProperty("keyAttributeName", keyAttributeName);
            return this;
        }
        /**
         * Attribute type when creating table.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyAttributeType the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder keyAttributeType(String keyAttributeType) {
            doSetProperty("keyAttributeType", keyAttributeType);
            return this;
        }
        /**
         * The key scalar type, it can be S (String), N (Number) and B (Bytes).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyScalarType the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder keyScalarType(String keyScalarType) {
            doSetProperty("keyScalarType", keyScalarType);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ddb.Ddb2Operations&lt;/code&gt; type.
         * 
         * Default: PutItem
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder operation(
                org.apache.camel.component.aws2.ddb.Ddb2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.ddb.Ddb2Operations&lt;/code&gt; type.
         * 
         * Default: PutItem
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder overrideEndpoint(String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * To define a proxy host when instantiating the DDB client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The region in which DynamoDB client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The region in which DynamoDB client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDB client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDB client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param readCapacity the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder readCapacity(Long readCapacity) {
            doSetProperty("readCapacity", readCapacity);
            return this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param readCapacity the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder readCapacity(String readCapacity) {
            doSetProperty("readCapacity", readCapacity);
            return this;
        }
        /**
         * The region in which DDB client needs to work.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the S3 client should expect to load credentials through a
         * default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the S3 client should expect to load credentials through a
         * default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param writeCapacity the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder writeCapacity(Long writeCapacity) {
            doSetProperty("writeCapacity", writeCapacity);
            return this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param writeCapacity the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder writeCapacity(String writeCapacity) {
            doSetProperty("writeCapacity", writeCapacity);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS DynamoDB component.
     */
    public interface AdvancedDdb2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Ddb2EndpointBuilder basic() {
            return (Ddb2EndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDdb2EndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDdb2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface Ddb2Builders {
        /**
         * AWS DynamoDB (camel-aws2-ddb)
         * Store and retrieve data from AWS DynamoDB service using AWS SDK
         * version 2.x.
         * 
         * Category: cloud,database
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ddb
         * 
         * @return the dsl builder for the headers' name.
         */
        default Ddb2HeaderNameBuilder aws2Ddb() {
            return Ddb2HeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS DynamoDB (camel-aws2-ddb)
         * Store and retrieve data from AWS DynamoDB service using AWS SDK
         * version 2.x.
         * 
         * Category: cloud,database
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ddb
         * 
         * Syntax: <code>aws2-ddb:tableName</code>
         * 
         * Path parameter: tableName (required)
         * The name of the table currently worked with.
         * 
         * @param path tableName
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder aws2Ddb(String path) {
            return Ddb2EndpointBuilderFactory.endpointBuilder("aws2-ddb", path);
        }
        /**
         * AWS DynamoDB (camel-aws2-ddb)
         * Store and retrieve data from AWS DynamoDB service using AWS SDK
         * version 2.x.
         * 
         * Category: cloud,database
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ddb
         * 
         * Syntax: <code>aws2-ddb:tableName</code>
         * 
         * Path parameter: tableName (required)
         * The name of the table currently worked with.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path tableName
         * @return the dsl builder
         */
        default Ddb2EndpointBuilder aws2Ddb(String componentName, String path) {
            return Ddb2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the AWS DynamoDB component.
     */
    public static class Ddb2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final Ddb2HeaderNameBuilder INSTANCE = new Ddb2HeaderNameBuilder();

        /**
         * The list of attributes returned by the operation.
         * 
         * The option is a: {@code Map<String, AttributeValue>} type.
         * 
         * Group: DeleteItem GetItem PutItem UpdateItem
         * 
         * @return the name of the header {@code AwsDdbAttributes}.
         */
        public String awsDdbAttributes() {
            return "AwsDdbAttributes";
        }

        /**
         * If attribute names are not specified then all attributes will be
         * returned.
         * 
         * The option is a: {@code Collection<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbAttributeNames}.
         */
        public String awsDdbAttributeNames() {
            return "AwsDdbAttributeNames";
        }

        /**
         * A map of the table name and corresponding items to get by primary
         * key.
         * 
         * The option is a: {@code Map<String, KeysAndAttributes>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbBatchItems}.
         */
        public String awsDdbBatchItems() {
            return "AwsDdbBatchItems";
        }

        /**
         * Table names and the respective item attributes from the tables.
         * 
         * The option is a: {@code Map<String, BatchResponse>} type.
         * 
         * Group: BatchGetItems
         * 
         * @return the name of the header {@code AwsDdbBatchResponse}.
         */
        public String awsDdbBatchResponse() {
            return "AwsDdbBatchResponse";
        }

        /**
         * If set to true, then a consistent read is issued, otherwise
         * eventually consistent is used.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbConsistentRead}.
         */
        public String awsDdbConsistentRead() {
            return "AwsDdbConsistentRead";
        }

        /**
         * The number of Capacity Units of the provisioned throughput of the
         * table consumed during the operation.
         * 
         * The option is a: {@code Double} type.
         * 
         * Group: Query Scan
         * 
         * @return the name of the header {@code AwsDdbConsumedCapacity}.
         */
        public String awsDdbConsumedCapacity() {
            return "AwsDdbConsumedCapacity";
        }

        /**
         * Number of items in the response.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: Query Scan
         * 
         * @return the name of the header {@code AwsDdbCount}.
         */
        public String awsDdbCount() {
            return "AwsDdbCount";
        }

        /**
         * Creation DateTime of this table.
         * 
         * The option is a: {@code Date} type.
         * 
         * Group: DeleteTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbCreationDate}.
         */
        public String awsDdbCreationDate() {
            return "AwsDdbCreationDate";
        }

        /**
         * If set will be used as Secondary Index for Query operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbIndexName}.
         */
        public String awsDdbIndexName() {
            return "AwsDdbIndexName";
        }

        /**
         * A map of the attributes for the item, and must include the primary
         * key values that define the item.
         * 
         * The option is a: {@code Map<String, AttributeValue>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbItem}.
         */
        public String awsDdbItem() {
            return "AwsDdbItem";
        }

        /**
         * The list of attributes returned by the operation.
         * 
         * The option is a: {@code List<Map<String,AttributeValue>>} type.
         * 
         * Group: Query Scan
         * 
         * @return the name of the header {@code AwsDdbItems}.
         */
        public String awsDdbItems() {
            return "AwsDdbItems";
        }

        /**
         * Item count for this table.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: DeleteTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbTableItemCount}.
         */
        public String awsDdbTableItemCount() {
            return "AwsDdbTableItemCount";
        }

        /**
         * The primary key that uniquely identifies each item in a table.
         * 
         * The option is a: {@code Map<String, AttributeValue>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbKey}.
         */
        public String awsDdbKey() {
            return "AwsDdbKey";
        }

        /**
         * This header specify the selection criteria for the query, and merge
         * together the two old headers CamelAwsDdbHashKeyValue and
         * CamelAwsDdbScanRangeKeyCondition.
         * 
         * The option is a: {@code Map<String, Condition>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbKeyConditions}.
         */
        public String awsDdbKeyConditions() {
            return "AwsDdbKeyConditions";
        }

        /**
         * The KeySchema that identifies the primary key for this table. From
         * Camel 2.16.0 the type of this header is List and not KeySchema.
         * 
         * The option is a: {@code List<KeySchemaElement>} type.
         * 
         * Group: DeleteTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbKeySchema}.
         */
        public String awsDdbKeySchema() {
            return "AwsDdbKeySchema";
        }

        /**
         * Primary key of the item where the query operation stopped, inclusive
         * of the previous result set.
         * 
         * The option is a: {@code Key} type.
         * 
         * Group: Query Scan
         * 
         * @return the name of the header {@code AwsDdbLastEvaluatedKey}.
         */
        public String awsDdbLastEvaluatedKey() {
            return "AwsDdbLastEvaluatedKey";
        }

        /**
         * The maximum number of items to return.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbLimit}.
         */
        public String awsDdbLimit() {
            return "AwsDdbLimit";
        }

        /**
         * The operation to perform.
         * 
         * The option is a: {@code
         * org.apache.camel.component.aws2.ddb.Ddb2Operations} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbOperation}.
         */
        public String awsDdbOperation() {
            return "AwsDdbOperation";
        }

        /**
         * The value of the ProvisionedThroughput property for this table.
         * 
         * The option is a: {@code
         * software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughputDescription} type.
         * 
         * Group: DeleteTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbProvisionedThroughput}.
         */
        public String awsDdbProvisionedThroughput() {
            return "AwsDdbProvisionedThroughput";
        }

        /**
         * ReadCapacityUnits property of this table.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: UpdateTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbReadCapacity}.
         */
        public String awsDdbReadCapacity() {
            return "AwsDdbReadCapacity";
        }

        /**
         * Use this parameter if you want to get the attribute name-value pairs
         * before or after they are modified(NONE, ALL_OLD, UPDATED_OLD,
         * ALL_NEW, UPDATED_NEW).
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbReturnValues}.
         */
        public String awsDdbReturnValues() {
            return "AwsDdbReturnValues";
        }

        /**
         * Number of items in the complete scan before any filters are applied.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: Scan
         * 
         * @return the name of the header {@code AwsDdbScannedCount}.
         */
        public String awsDdbScannedCount() {
            return "AwsDdbScannedCount";
        }

        /**
         * Specifies forward or backward traversal of the index.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbScanIndexForward}.
         */
        public String awsDdbScanIndexForward() {
            return "AwsDdbScanIndexForward";
        }

        /**
         * Evaluates the scan results and returns only the desired values.
         * 
         * The option is a: {@code Map<String, Condition>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbScanFilter}.
         */
        public String awsDdbScanFilter() {
            return "AwsDdbScanFilter";
        }

        /**
         * Primary key of the item from which to continue an earlier query.
         * 
         * The option is a: {@code Map<String, AttributeValue>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbStartKey}.
         */
        public String awsDdbStartKey() {
            return "AwsDdbStartKey";
        }

        /**
         * Table Name for this operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbTableName}.
         */
        public String awsDdbTableName() {
            return "AwsDdbTableName";
        }

        /**
         * The table size in bytes.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: DeleteTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbTableSize}.
         */
        public String awsDdbTableSize() {
            return "AwsDdbTableSize";
        }

        /**
         * The status of the table: CREATING, UPDATING, DELETING, ACTIVE.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: DeleteTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbTableStatus}.
         */
        public String awsDdbTableStatus() {
            return "AwsDdbTableStatus";
        }

        /**
         * Designates an attribute for a conditional modification.
         * 
         * The option is a: {@code Map<String, ExpectedAttributeValue>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbUpdateCondition}.
         */
        public String awsDdbUpdateCondition() {
            return "AwsDdbUpdateCondition";
        }

        /**
         * Map of attribute name to the new value and action for the update.
         * 
         * The option is a: {@code Map<String, AttributeValueUpdate>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsDdbUpdateValues}.
         */
        public String awsDdbUpdateValues() {
            return "AwsDdbUpdateValues";
        }

        /**
         * Contains a map of tables and their respective keys that were not
         * processed with the current response.
         * 
         * The option is a: {@code Map<String,KeysAndAttributes>} type.
         * 
         * Group: BatchGetItems
         * 
         * @return the name of the header {@code AwsDdbUnprocessedKeys}.
         */
        public String awsDdbUnprocessedKeys() {
            return "AwsDdbUnprocessedKeys";
        }

        /**
         * WriteCapacityUnits property of this table.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: UpdateTable DescribeTable
         * 
         * @return the name of the header {@code AwsDdbWriteCapacity}.
         */
        public String awsDdbWriteCapacity() {
            return "AwsDdbWriteCapacity";
        }
    }
    static Ddb2EndpointBuilder endpointBuilder(String componentName, String path) {
        class Ddb2EndpointBuilderImpl extends AbstractEndpointBuilder implements Ddb2EndpointBuilder, AdvancedDdb2EndpointBuilder {
            public Ddb2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Ddb2EndpointBuilderImpl(path);
    }
}