--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.0
-- Dumped by pg_dump version 9.4.0
-- Started on 2021-09-27 23:51:36

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 177 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2022 (class 0 OID 0)
-- Dependencies: 177
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 174 (class 1259 OID 16527)
-- Name: tbl_bibliotecarios; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tbl_bibliotecarios (
    codigo character varying(50),
    nombre character varying(50),
    apellidos character varying(50),
    correo character varying(50),
    hora time with time zone
);


ALTER TABLE tbl_bibliotecarios OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 16568)
-- Name: tbl_devoluciones; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tbl_devoluciones (
    ced numeric,
    nom character varying(50),
    ref character varying(50),
    nomlibro character varying(50),
    fechaentrega date,
    entrego character varying(50),
    hora character varying(50)
);


ALTER TABLE tbl_devoluciones OWNER TO postgres;

--
-- TOC entry 172 (class 1259 OID 16519)
-- Name: tbl_login; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tbl_login (
    correoe character varying(50),
    clave character varying(50) NOT NULL
);


ALTER TABLE tbl_login OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 16530)
-- Name: tbl_persona; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tbl_persona (
    ced numeric NOT NULL,
    nom character varying(50),
    ref character varying(50),
    nomlibro character varying(50),
    fecha date
);


ALTER TABLE tbl_persona OWNER TO postgres;

--
-- TOC entry 2023 (class 0 OID 0)
-- Dependencies: 175
-- Name: COLUMN tbl_persona.nom; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tbl_persona.nom IS 'nombre';


--
-- TOC entry 173 (class 1259 OID 16524)
-- Name: tbl_registro; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tbl_registro (
    persona character varying(50),
    hora time without time zone,
    fecha date,
    termino time without time zone
);


ALTER TABLE tbl_registro OWNER TO postgres;

--
-- TOC entry 2012 (class 0 OID 16527)
-- Dependencies: 174
-- Data for Name: tbl_bibliotecarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tbl_bibliotecarios (codigo, nombre, apellidos, correo, hora) FROM stdin;
04	Edier	Largo	edier.largo@ucp.edu.co	11:00:08-05
\.


--
-- TOC entry 2014 (class 0 OID 16568)
-- Dependencies: 176
-- Data for Name: tbl_devoluciones; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tbl_devoluciones (ced, nom, ref, nomlibro, fechaentrega, entrego, hora) FROM stdin;
2	Jose	235	Mil Noches	2021-09-27	SI	11:27:4
1059707726	Edier Humberto Largo	AAA01	Cien Años de Soledad	2021-09-27	SI	11:29:12
\.


--
-- TOC entry 2010 (class 0 OID 16519)
-- Dependencies: 172
-- Data for Name: tbl_login; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tbl_login (correoe, clave) FROM stdin;
edierlargo	3218114687
\.


--
-- TOC entry 2013 (class 0 OID 16530)
-- Dependencies: 175
-- Data for Name: tbl_persona; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tbl_persona (ced, nom, ref, nomlibro, fecha) FROM stdin;
1059707726	Edier Humberto Largo	AAA01	Cien Años de Soledad	2021-09-27
\.


--
-- TOC entry 2011 (class 0 OID 16524)
-- Dependencies: 173
-- Data for Name: tbl_registro; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tbl_registro (persona, hora, fecha, termino) FROM stdin;
\.


--
-- TOC entry 1900 (class 2606 OID 16537)
-- Name: cedula; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tbl_persona
    ADD CONSTRAINT cedula PRIMARY KEY (ced);


--
-- TOC entry 1898 (class 2606 OID 16523)
-- Name: clave; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tbl_login
    ADD CONSTRAINT clave PRIMARY KEY (clave);


--
-- TOC entry 2021 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2021-09-27 23:51:37

--
-- PostgreSQL database dump complete
--

