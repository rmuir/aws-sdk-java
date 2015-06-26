/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * An array of UnprocessedIdentityId objects, each of which contains an
 * ErrorCode and IdentityId.
 * </p>
 */
public class UnprocessedIdentityId implements Serializable, Cloneable {

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * The error code indicating the type of error that occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDenied, InternalServerError
     */
    private String errorCode;

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A unique identifier in the format REGION:GUID.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UnprocessedIdentityId withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * The error code indicating the type of error that occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDenied, InternalServerError
     *
     * @return The error code indicating the type of error that occurred.
     *
     * @see ErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    /**
     * The error code indicating the type of error that occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDenied, InternalServerError
     *
     * @param errorCode The error code indicating the type of error that occurred.
     *
     * @see ErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
     * The error code indicating the type of error that occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDenied, InternalServerError
     *
     * @param errorCode The error code indicating the type of error that occurred.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ErrorCode
     */
    public UnprocessedIdentityId withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * The error code indicating the type of error that occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDenied, InternalServerError
     *
     * @param errorCode The error code indicating the type of error that occurred.
     *
     * @see ErrorCode
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }
    
    /**
     * The error code indicating the type of error that occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDenied, InternalServerError
     *
     * @param errorCode The error code indicating the type of error that occurred.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ErrorCode
     */
    public UnprocessedIdentityId withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getErrorCode() != null) sb.append("ErrorCode: " + getErrorCode() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UnprocessedIdentityId == false) return false;
        UnprocessedIdentityId other = (UnprocessedIdentityId)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getErrorCode() == null ^ this.getErrorCode() == null) return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false) return false; 
        return true;
    }
    
    @Override
    public UnprocessedIdentityId clone() {
        try {
            return (UnprocessedIdentityId) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    