package org.apache.maven.api.plugin;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.api.annotations.Experimental;
import org.apache.maven.api.services.MavenException;

/**
 * An exception occurring during the execution of a plugin.
 *
 * @since 4.0
 */
@Experimental
public class MojoException
    extends MavenException
{

    protected Object source;

    protected String longMessage;

    /**
     * Construct a new <code>MojoException</code> exception providing the source and a short and long message:
     * these messages are used to improve the message written at the end of Maven build.
     */
    public MojoException( Object source, String shortMessage, String longMessage )
    {
        super( shortMessage );
        this.source = source;
        this.longMessage = longMessage;
    }

    /**
     * Construct a new <code>MojoExecutionException</code> exception wrapping an underlying <code>Throwable</code>
     * and providing a <code>message</code>.
     */
    public MojoException( String message, Throwable cause )
    {
        super( message, cause );
    }

    /**
     * Construct a new <code>MojoExecutionException</code> exception providing a <code>message</code>.
     */
    public MojoException( String message )
    {
        super( message );
    }

    /**
     * Constructs a new {@code MojoExecutionException} exception wrapping an underlying {@code Throwable}.
     *
     * @param cause the cause which is saved for later retrieval by the {@link #getCause()} method.
     *              A {@code null} value is permitted, and indicates that the cause is nonexistent or unknown.
     */
    public MojoException( Throwable cause )
    {
        super( cause );
    }

    public String getLongMessage()
    {
        return longMessage;
    }

    public Object getSource()
    {
        return source;
    }

}
