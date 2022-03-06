import Footer from "components/Footer";
import NavBar from "components/Navbar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                <h1 className="display-4">Sales Dashboard</h1>
                <p className="lead">Simple ReactJS SPA project, with a Spring/Java API</p>

                <Link className="btn btn-primary btn-lg" to="/dashboard">
                    Visit Dashboard
                </Link>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Home;