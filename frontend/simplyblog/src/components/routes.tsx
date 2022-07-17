import { Routes, Route } from "react-router-dom";
import Home from "./home";
import Profile from "./profile";
import Login from "./login";
import Register from "./register";
import PublicProfile from "./public_profile";

type Props = {}

export default function AppRoutes({}: Props) {
  return (
    <div>
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/profile" element={<Profile />} />
            <Route path="/login" element={<Login />} />
            <Route path="/register" element={<Register />} />
            <Route path="/user/profile" element={<PublicProfile />} />
        </Routes>
    </div>
  )
}