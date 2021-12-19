
import './App.css';
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import ListBoardComponent from './components/ListBoardComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';

import 'bootstrap/dist/css/bootstrap.min.css'

function App() {
  return (
      <div>
          <Router>
              <HeaderComponent/>
                <div className="container">
                    <Routes>
                        <Route path = "/" exact component = {ListBoardComponent}>home</Route>
                        <Route path = "/board" component = {ListBoardComponent}>boardList</Route>
                    </Routes>
                </div>
              <FooterComponent/>
          </Router>
      </div>
  );
}

export default App;
