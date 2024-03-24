import logo from '../../img/logo.svg';
import './styles.css';
function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta"/>
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por
                    <a href="linkedin.com/in/yago-moreira"> Yago Moreira</a>
                </p>
            </div>
        </header>
    )
}

export default Header;