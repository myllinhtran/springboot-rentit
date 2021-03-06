import React, {Component} from 'react';
import {Card, Row, Col, Image} from "react-bootstrap";
import Bob from './img/Bob.png';
import './css/Account.css';

class Account extends Component {

    render() {

        const {id, firstName, lastName, email, mobile} = this.props;

        return (
            <div className={"Account"}>
                <br/>
                <Card style={{margin: "0 0 20px 0"}}>
                    <Card.Header>Account ID: {id}</Card.Header>
                    <Card.Body>
                        <Row>
                            <Col>
                                <Card.Title>{firstName} {lastName}</Card.Title>
                                <ul>
                                    <li>{mobile}</li>
                                    <li>{email}</li>
                                </ul>
                            </Col>
                            <Col xs={4} align={"right"}>
                                <Image src={Bob} rounded={"10px"} style={{width: "50%"}}/>
                            </Col>
                        </Row>
                    </Card.Body>
                </Card>
            </div>
        );
    }
}

export default Account;