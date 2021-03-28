import React from 'react';

class SampleLogin extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            username: "",
            userId: ""
        };
    }

    onChangeHandler = (event) => {
        
    }

    render () {
        return (
            <div>
                <h1>Sample Login</h1>
            </div>
        );
    }
}

export default SampleLogin;
